package k2b6s9j.BoatCraft.compatibility.thaumcraft.boat.wood.silverwood

import net.minecraft.world.World
import k2b6s9j.BoatCraft.boat.Boat.{EntityBoatContainer, RenderBoat, ItemCustomBoat}
import k2b6s9j.BoatCraft.compatibility.thaumcraft.boat.Materials
import k2b6s9j.BoatCraft.boat.Modifiers
import cpw.mods.fml.common.registry.GameRegistry

object Chest {

  class Entity(world: World) extends EntityBoatContainer(world) with Materials.Entity.Wood.Silverwood with Modifiers.Entity.Chest {

    override def useItemID(): Boolean = {
      true
    }

    override def customBoatItemID(): Int = {
      Item.shiftedID
    }

  }

  object Item {

    var ID: Int = _
    var shiftedID: Int = _
    var item: Item = new Item(ID)

  }

  class Item(id: Int) extends ItemCustomBoat(id) {

    setUnlocalizedName("boat.compatibility.wood.silverwood.chest")
    GameRegistry.registerItem(this, "Chest Silverwood Boat")
    Item.shiftedID = this.itemID

  }

  class Render extends RenderBoat with Materials.Render.Wood.Silverwood with Modifiers.Render.Chest {

  }

}
