/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.speedmodes.other

import net.ccbluex.liquidbounce.features.module.modules.movement.speedmodes.SpeedMode
import net.ccbluex.liquidbounce.utils.MovementUtils.isMoving

object Legit : SpeedMode("Legit") {
    override fun onStrafe() {
        val player = mc.thePlayer ?: return

        if (mc.thePlayer.onGround && isMoving && !mc.gameSettings.keyBindJump.isKeyDown) {
            player.jump()
        }

    }
}