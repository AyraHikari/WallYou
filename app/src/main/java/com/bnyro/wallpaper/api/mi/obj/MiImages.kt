package com.bnyro.wallpaper.api.mi.obj

import com.fasterxml.jackson.annotation.JsonProperty

data class MiImages(
    @JsonProperty("cl_url") val cl_url: MiCurl? = null,
    @JsonProperty("text_layers") val text_layers: List<TextLayers>? = null
)

data class TextLayers(
    val c_pos_x: Int? = null,
    val c_pos_y: Int? = null,
    val color: String? = null,
    val txt: String? = null,
    val txt_size: Int? = null,
    val type: Int? = null,
)