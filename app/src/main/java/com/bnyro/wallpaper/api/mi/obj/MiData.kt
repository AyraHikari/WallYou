package com.bnyro.wallpaper.api.mi.obj

import com.fasterxml.jackson.annotation.JsonProperty

data class MiData(
    @JsonProperty("bizids") val bizids: List<String>? = null,
    @JsonProperty("child_item_count") val child_item_count: Int? = null,
    @JsonProperty("exparam") val exparam: ExParam? = null,
    @JsonProperty("favor_count") val favor_count: Int? = null,

    @JsonProperty("id") val id: String? = null,
    @JsonProperty("images") val images: List<MiImages>,

    @JsonProperty("is_favor") val is_favor: Int? = null,
    @JsonProperty("item_type") val item_type: String? = null,
    @JsonProperty("j_actions") val j_actions: Any? = null,

    @JsonProperty("meta") val meta: MiMeta? = null,
    @JsonProperty("rcm_info") val rcm_info: RcmInfo? = null,
    @JsonProperty("times") val times: MiTimes? = null
)

data class ExParam(
    val img_level: Int? = null
)

data class RcmInfo(
    val expid: String? = null,
    val order_f: Int? = null,
    val rcm_type: String? = null,
    val reqid: String? = null,
    val traceid: String? = null,
)