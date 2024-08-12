package com.siepert.createlegacy.tileentity;

import com.siepert.createapi.IKineticTE;
import com.siepert.createapi.KineticBlockInstance;
import com.siepert.createapi.NetworkContext;
import com.siepert.createlegacy.CreateLegacyConfigHolder;
import com.siepert.createlegacy.blocks.kinetic.BlockAxle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

public class TileEntityShaft extends TileEntity implements IKineticTE {
    @Override
    public double getStressImpact() {
        return 0;
    }

    @Override
    public boolean isConsumer() {
        return false;
    }

    @Override
    public boolean isGenerator() {
        return false;
    }

    @Override
    public double getStressCapacity() {
        return CreateLegacyConfigHolder.kineticConfig.shaftStressImpact;
    }

    @Override
    public int getProducedSpeed() {
        return 0;
    }

    @Override
    public void updateTick(NetworkContext context) {

    }

    @Override
    public void setUpdated() {

    }

    @Override
    public void passNetwork(NetworkContext context, EnumFacing source,
                            boolean srcIsCog, boolean srcCogIsHorizontal, boolean inverted) {
        IBlockState state = world.getBlockState(pos);
        if (srcIsCog) return;
        if (source.getAxis() == state.getValue(BlockAxle.AXIS)) {
            context.blocksToActivate.add(new KineticBlockInstance(pos, inverted));

            TileEntity entity = world.getTileEntity(pos.offset(source.getOpposite()));
            if (entity instanceof IKineticTE) {
                ((IKineticTE) entity).passNetwork(context, source, false, false, inverted);
            }
        }
    }
}
