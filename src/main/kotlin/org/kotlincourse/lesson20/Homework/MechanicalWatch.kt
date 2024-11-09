package org.sergei.org.kotlincourse.lesson20.Homework

abstract class MechanicalWatch:PoweredDevice(),
    Timable,
    Mechanical
{
    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }

    override fun performMechanicalAction() {
        TODO("Not yet implemented")
    }
}