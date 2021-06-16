package com.teamnoyes.bookreview.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.teamnoyes.bookreview.model.Review

@Dao
interface ReviewDao {
    @Query("SELECT * FROM review WHERE id == :id")
    fun getOneReview(id: Int): Review

    // 만약 똑같은 id 값이 있는 경우 대체됨
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveReview(review: Review)
}