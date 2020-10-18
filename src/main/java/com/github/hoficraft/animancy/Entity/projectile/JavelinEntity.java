package com.github.hoficraft.animancy.Entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class JavelinEntity extends ProjectileItemEntity{

	public JavelinEntity(EntityType<? extends JavelinEntity> p_i50159_1_, World p_i50159_2_) {
	      super(p_i50159_1_, p_i50159_2_);
	   }

	   public JavelinEntity(World worldIn, LivingEntity throwerIn) {
	      super(EntityType.SNOWBALL, throwerIn, worldIn);
	   }

	   public JavelinEntity(World worldIn, double x, double y, double z) {
	      super(EntityType.SNOWBALL, x, y, z, worldIn);
	   }

	   protected Item getDefaultItem() {
	      return Items.SNOWBALL;
	   }

	   /**
	    * Called when the Javelin hits a block or entity.
	    */
	   protected void onImpact(RayTraceResult result) {
	      super.onImpact(result);
	      if (!this.world.isRemote) {
	         this.world.setEntityState(this, (byte)3);
	         this.remove();
	      }

	   }
	   
	   

}
