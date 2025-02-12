package com.lagradost.quicknovel.providers

import com.lagradost.quicknovel.MadaraReader
import com.lagradost.quicknovel.R

class MeioNovelProvider : MadaraReader() {
    override val name = "MeioNovel"
    override val mainUrl = "https://meionovel.id"
    override val iconId = R.drawable.ic_meionovel
}
