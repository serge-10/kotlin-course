package org.sergei.org.kotlincourse.lessonKaspresso

import com.google.gson.annotations.Until
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector
import org.hamcrest.Description
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import sun.security.util.Debug.println


data class SuspiciousActivity(val isDetected: Boolean, val suspicionLevel: Int, val notes: String)
class IsDetectedMatcher(
    private val isDetected: Boolean
) : TypeSafeMatcher<SuspiciousActivity>() {
    override fun describeTo(description: Description) {
        description.appendText("isDetected is $isDetected")
    }

    override fun matchesSafely(activity: SuspiciousActivity): Boolean {
        return activity.isDetected == isDetected
    }
}

class SuspicionLevelInRangeMatcher(
    private val min: Int,
    private val max: Int
) : TypeSafeMatcher<SuspiciousActivity>() {
    override fun describeTo(description: Description) {
        description.appendText("suspicionLevel is between $min and $max")
    }

    override fun matchesSafely(activity: SuspiciousActivity): Boolean {
        return activity.suspicionLevel in min..max
    }
}

class NotesInMatcher(private val validNotes: List<String>) : TypeSafeMatcher<SuspiciousActivity>() {
    override fun describeTo(description: Description) {
        description.appendText("notes is one of $validNotes")
    }

    override fun matchesSafely(activity: SuspiciousActivity): Boolean {
        return activity.notes in validNotes
    }
}

class MatcherBulder() {
    val listOfMatcher
        get() = mutableListOf<Selector.Matcher<SuspicousActivity>>()

    operator fun invoke(function: MatcherBulder.() -> Until) {
        function()
    }
    fun detect(isDetected: Boolean) {
        val detectedMatcher = IsDetectedMatcher(isDetected)
    }
    fun suspicious(min: Int,max: Int) {
        listOfMatcher.add(SuspicionLevelInRangeMatcher(min,max))
    }
    fun notes(validNotes: List<String>) {
        listOfMatcher.add(NotesInMatcher(validNotes))
    }
}

class SuspicousActivity {

}

fun main() {
    val activities = listOf(
        SuspiciousActivity(true, 5, "unauthorized access"),
        SuspiciousActivity(false, 4, "unauthorized access")
    )

    val matchers = allOf(
        SuspicionLevelInRangeMatcher(3,4),
        NotesInMatcher(listOf("unauthorized access", "security breach"))
    )
    val result = activities.filter { matchers.matches(it) }


    println(result)
}
