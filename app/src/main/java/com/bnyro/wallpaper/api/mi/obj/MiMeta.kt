package com.bnyro.wallpaper.api.mi.obj

import com.fasterxml.jackson.annotation.JsonProperty

data class MiMeta(
    @JsonProperty("album_info") val album_info: AlbumInfo? = null,
    @JsonProperty("all_tags") val all_tags: List<String>? = null,
    @JsonProperty("categories") val categories: List<Vendor>? = null,
    @JsonProperty("cp") val cp: Media? = null,
    @JsonProperty("desc") val desc: String? = null,
    @JsonProperty("is_all") val is_all: Int? = null,
    @JsonProperty("link_type") val link_type: Int? = null,
    @JsonProperty("media") val media: Media? = null,
    @JsonProperty("tags") val tags: List<String>? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("vendor") val vendor: Vendor? = null
)

data class AlbumInfo(
    val banner: String? = null,
    val id: String? = null,
    val idx: Int? = null,
    val total_count: Int? = null
)

data class Vendor(
    val id: String? = null,
    val name: String? = null,
)

data class Media(
    val icon: String? = null,
    val id: String? = null,
    val name: String? = null
)