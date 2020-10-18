package com.github.hoficraft.animancy.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class AltarBlock extends Block{

	private static final VoxelShape SHAPE = Block.makeCuboidShape(1, 0, 1, 15, 13, 15);
	
	public AltarBlock(AbstractBlock.Properties properties) {
		super(properties);		
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx) {
		return SHAPE;
	}	
}
