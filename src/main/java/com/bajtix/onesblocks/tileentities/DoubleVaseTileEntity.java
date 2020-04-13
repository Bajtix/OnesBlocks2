package com.bajtix.onesblocks.tileentities;

import com.bajtix.onesblocks.ModTileEntityTypes;
import com.bajtix.onesblocks.utility.NBTHelper;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.server.ServerWorld;

public class DoubleVaseTileEntity extends TileEntity implements ITickableTileEntity {

    public int x, y, z, tick;
    boolean initialized = false;

    public DoubleVaseTileEntity(TileEntityType<?> tileEntityType) {
        super(tileEntityType);
    }

    public DoubleVaseTileEntity() {
        this(ModTileEntityTypes.DOUBLE_VASE.get());
    }

    @Override
    public void tick() {
        if (!initialized) init();
        tick++;
        if (tick == 20) {
            tick = 0;
            if (!world.isRemote)
                ((ServerWorld) this.world).addLightningBolt(new LightningBoltEntity(this.world, x, y, z, false));
        }
    }

    private void init() {
        initialized = true;
        x = this.pos.getX() - 1;
        y = this.pos.getY() - 1;
        z = this.pos.getZ() - 1;
        tick = 0;
    }

    @Override
    public CompoundNBT write(CompoundNBT nbt) {
        nbt.put("initvalues", NBTHelper.toNBT(this));
        return super.write(nbt);
    }

    @Override
    public void read(CompoundNBT nbt) {
        super.read(nbt);
        CompoundNBT initValues = nbt.getCompound("initvalues");
        if (initValues != null) {
            this.x = initValues.getInt("x");
            this.y = initValues.getInt("y");
            this.z = initValues.getInt("z");
            this.tick = 0;
            this.initialized = true;
            return;
        } else
            init();
    }
}
