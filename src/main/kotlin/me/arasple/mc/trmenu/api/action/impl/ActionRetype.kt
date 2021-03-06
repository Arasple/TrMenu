package me.arasple.mc.trmenu.api.action.impl

import me.arasple.mc.trmenu.api.action.base.AbstractAction
import me.arasple.mc.trmenu.api.action.base.ActionOption
import me.arasple.mc.trmenu.module.internal.data.Metadata
import org.bukkit.entity.Player

/**
 * @author Arasple
 * @date 2021/1/31 21:04
 */
class ActionRetype : AbstractAction() {

    override fun onExecute(player: Player, placeholderPlayer: Player) {
        Metadata.setBukkitMeta(player, "RE_ENTER")
    }

    companion object {

        private val name = "re-?(peat|catcher|input|enter|type)s?".toRegex()

        private val parser: (Any, ActionOption) -> AbstractAction = { _, _ ->
            ActionRetype()
        }

        val registery = name to parser

    }

}
