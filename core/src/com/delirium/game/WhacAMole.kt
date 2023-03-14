package com.delirium.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class WhacAMole : ApplicationAdapter() {
    var batch: SpriteBatch? = null
    var img: Texture? = null
    var holeImg: Texture? = null

    override fun create() {
        batch = SpriteBatch()
        img = Texture("background.jpg")

    }

    override fun render() {
        ScreenUtils.clear(1f, 0f, 0f, 1f)
        batch!!.begin()
        batch!!.draw(img, 0f, 0f)
        batch!!.end()
    }

    override fun dispose() {
        batch!!.dispose()
        img!!.dispose()
    }
}