package br.com.arthurjf.cursoandroid.applistavip.controller

import br.com.arthurjf.cursoandroid.applistavip.model.Course

class CourseController {
    fun getCourseList(): MutableList<Course>{
        val courseList = ArrayList<Course>()

        courseList.add(Course("HTML"))
        courseList.add(Course("C#"))
        courseList.add(Course("Kotlin"))
        courseList.add(Course("Java"))
        courseList.add(Course("Python"))
        courseList.add(Course("C"))
        courseList.add(Course("PHP"))

        return courseList
    }

    fun getCourseListForSpinner(): ArrayList<String>{
        val coursesForAdapter = ArrayList<String>()
        val courseList = getCourseList()

        for (course in courseList){
            coursesForAdapter.add(course.courseName)
        }

        return coursesForAdapter
    }
}