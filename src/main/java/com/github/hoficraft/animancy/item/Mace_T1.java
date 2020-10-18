package com.github.hoficraft.animancy.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Mace_T1 extends Item{

	public int fireballStrength = 3;
	
	public Mace_T1(Item.Properties properties) {
		super(properties);
		
	}
	
	@SuppressWarnings("unused")
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
    	if(!world.isRemote) {
    		Vector3d loockVector = playerIn.getLook(1.0F);
            double velocityX = playerIn.getPosX() - (playerIn.getPosX() + loockVector.x * 4.0D);
            double velocityY = playerIn.getPosY() - (playerIn.getPosY() + loockVector.y);
            double velocityZ = playerIn.getPosZ() - (playerIn.getPosZ() + loockVector.z * 4.0D);
            
            FireballEntity fireballentity = new FireballEntity(world, playerIn, -velocityX, -velocityY, -velocityZ);
            fireballentity.explosionPower = this.fireballStrength;
            fireballentity.setPosition(playerIn.getPosX() + loockVector.x * 4.0D, playerIn.getPosYHeight(0.5D) + loockVector.y, fireballentity.getPosZ() + loockVector.z * 4.0D);
            world.addEntity(fireballentity);
        
            playerIn.getCooldownTracker().setCooldown(this, 20);

           	}
        return super.onItemRightClick(world, playerIn, handIn);
	}    

}
