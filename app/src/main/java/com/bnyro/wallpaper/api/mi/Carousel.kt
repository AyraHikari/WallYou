package com.bnyro.wallpaper.api.mi

import com.bnyro.wallpaper.api.mi.obj.MiFetch
import retrofit2.http.GET
import retrofit2.http.Query

interface Carousel {
    @GET("lock/lock_view")
    suspend fun getWallpapers(
        @Query("_res") res: String,
        @Query("_eimi") userid: String,
        @Query("page_size") page_size: Int,
        @Query("channel_id") channel_id: String,
    ): MiFetch
}
