package k2b6s9j.BoatCraft.entity.boat.forestry.wood.acacia;

import k2b6s9j.BoatCraft.entity.boat.EntityCustomBoat;
import k2b6s9j.BoatCraft.item.boat.forestry.wood.acacia.BoatAcaciaTNT;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBoatAcaciaTNT extends EntityCustomBoat {
	
	public BoatAcaciaTNT item;
	
	public EntityBoatAcaciaTNT(World par1World)
    {
        super(par1World);
    }

    public EntityBoatAcaciaTNT(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    @Override
    public boolean doesBoatContainBlock()
    {
    	return true;
    }
    
    @Override
    public ItemStack blockInBoat()
    {
    	return new ItemStack(Block.tnt, 1, 0);
    }
    
    public boolean func_130002_c(EntityPlayer player)
    {
    	//Do not mount this boat on right click!
        return false;
    }
    
    public Block getDefaultDisplayTile()
    {
        return Block.tnt;
    }
    
    @Override
	public boolean isCustomBoat()
    {
    	return true;
    }
    
    @Override
	public boolean useItemID()
	{
		return true;
	}
    
	@Override
    public int customBoatItemID()
    {
    	return item.shiftedID;
    }

}
