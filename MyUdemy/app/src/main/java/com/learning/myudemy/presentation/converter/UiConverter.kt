package com.learning.myudemy.presentation.converter

import com.learning.myudemy.domain.model.Lecture
import com.learning.myudemy.presentation.model.UiLecture
import com.learning.myudemy.presentation.model.UiMyLeaningLecture

object UiConverter {
    fun toUiLecture(lecture:Lecture) = UiLecture(
        lecture.lectureId,
        lecture.lectureName,
        lecture.Instructor,
        lecture.gradeScore,
        lecture.gradeCount,
        lecture.lecturePrice,
        lecture.lectureThumbnailRes,
        lecture.isBestSeller
    )
    fun toUiMyLeaningLecture(lecture: Lecture) = UiMyLeaningLecture(
        lecture.lectureId,
        lecture.lectureName,
        lecture.Instructor,
        lecture.lectureThumbnailRes,
        lecture.lectureThumbnailUrl,
        false
    )
}