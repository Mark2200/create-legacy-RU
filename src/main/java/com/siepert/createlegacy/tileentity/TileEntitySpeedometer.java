package com.siepert.createlegacy.tileentity;

import com.siepert.createapi.CreateAPI;
import com.siepert.createapi.network.IKineticTE;
import com.siepert.createapi.network.KineticBlockInstance;
import com.siepert.createapi.network.NetworkContext;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import static com.siepert.createlegacy.blocks.kinetic.BlockNetworkMeter.AXIS;

public class TileEntitySpeedometer extends TileEntity implements IKineticTE {
    public String getMessage() {
        if (lastContext != null) {
            return lastContext.networkSpeed + " RS";
        }
        return CreateAPI.translateToLocal("networkContext.noData");
    }

    NetworkContext lastContext;
    public NetworkContext getLastContext() { // Needed for TOP
        return this.lastContext;
    }

    @Override
    public double getStressImpact() {
        return 0;
    }

    @Override
    public double getStressCapacity() {
        return 0;
    }

    @Override
    public int getProducedSpeed() {
        return 0;
    }

    @Override
    public boolean ignoreOverstress() {
        return true;
    }

    @Override
    public void kineticTick(NetworkContext context) {
        lastContext = context;
    }

    @Override
    public void setUpdated() {

    }

    @Override
    public void passNetwork(NetworkContext context, EnumFacing source, boolean srcIsCog, boolean srcCogIsHorizontal, boolean inverted) {
        IBlockState state = world.getBlockState(pos);

        if (srcIsCog) return;

        if (source.getAxis() == state.getValue(AXIS)) {
            context.addKineticBlockInstance(new KineticBlockInstance(pos, inverted));

            TileEntity entity = world.getTileEntity(pos.offset(source.getOpposite()));

            if (entity instanceof IKineticTE && !context.hasBlockBeenChecked(pos.offset(source.getOpposite()))) {
                ((IKineticTE) entity).passNetwork(context, source, false, false, inverted);
            }
        }
    }
}
