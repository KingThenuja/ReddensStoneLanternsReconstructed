//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class StonePillarBigTickProcedure {
    public StonePillarBigTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        boolean TopIsPillar = false;
        boolean BottomIsPillar = false;
        if (world.getBlockState(BlockPos.containing(x, y - (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_pillar")))) {
            BottomIsPillar = true;
        }

        if (world.getBlockState(BlockPos.containing(x, y + (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_pillar")))) {
            TopIsPillar = true;
        }

        if (BottomIsPillar) {
            if (TopIsPillar) {
                BlockPos _bp = BlockPos.containing(x, y, z);
                BlockState _bs = ((Block) BlockFile.STONE_PILLAR_BIG_MIDDLE.get()).defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);

                for(Property<?> _propertyOld : _bso.getProperties()) {
                    Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
                    if (_propertyNew != null && _bs.getValue(_propertyNew) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
                        } catch (Exception var23) {
                        }
                    }
                }

                BlockEntity _be = world.getBlockEntity(_bp);
                CompoundTag _bnbt = null;
                if (_be != null) {
                    _bnbt = _be.saveWithFullMetadata(world.registryAccess());
                    _be.setRemoved();
                }

                world.setBlock(_bp, _bs, 3);
                if (_bnbt != null) {
                    _be = world.getBlockEntity(_bp);
                    if (_be != null) {
                        try {
                            _be.loadWithComponents(_bnbt, world.registryAccess());
                        } catch (Exception var22) {
                        }
                    }
                }
            } else {
                BlockPos _bp = BlockPos.containing(x, y, z);
                BlockState _bs = ((Block) BlockFile.STONE_PILLAR_BIG_TOP.get()).defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);

                for(Property<?> _propertyOld : _bso.getProperties()) {
                    Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
                    if (_propertyNew != null && _bs.getValue(_propertyNew) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
                        } catch (Exception var21) {
                        }
                    }
                }

                BlockEntity _be = world.getBlockEntity(_bp);
                CompoundTag _bnbt = null;
                if (_be != null) {
                    _bnbt = _be.saveWithFullMetadata(world.registryAccess());
                    _be.setRemoved();
                }

                world.setBlock(_bp, _bs, 3);
                if (_bnbt != null) {
                    _be = world.getBlockEntity(_bp);
                    if (_be != null) {
                        try {
                            _be.loadWithComponents(_bnbt, world.registryAccess());
                        } catch (Exception var20) {
                        }
                    }
                }
            }
        } else if (TopIsPillar) {
            BlockPos _bp = BlockPos.containing(x, y, z);
            BlockState _bs = ((Block) BlockFile.STONE_PILLAR_BIG_BOTTOM.get()).defaultBlockState();
            BlockState _bso = world.getBlockState(_bp);

            for(Property<?> _propertyOld : _bso.getProperties()) {
                Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
                if (_propertyNew != null && _bs.getValue(_propertyNew) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
                    } catch (Exception var19) {
                    }
                }
            }

            BlockEntity _be = world.getBlockEntity(_bp);
            CompoundTag _bnbt = null;
            if (_be != null) {
                _bnbt = _be.saveWithFullMetadata(world.registryAccess());
                _be.setRemoved();
            }

            world.setBlock(_bp, _bs, 3);
            if (_bnbt != null) {
                _be = world.getBlockEntity(_bp);
                if (_be != null) {
                    try {
                        _be.loadWithComponents(_bnbt, world.registryAccess());
                    } catch (Exception var18) {
                    }
                }
            }
        } else {
            BlockPos _bp = BlockPos.containing(x, y, z);
            BlockState _bs = ((Block) BlockFile.STONE_PILLAR_BIG_SHORT.get()).defaultBlockState();
            BlockState _bso = world.getBlockState(_bp);

            for(Property<?> _propertyOld : _bso.getProperties()) {
                Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
                if (_propertyNew != null && _bs.getValue(_propertyNew) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
                    } catch (Exception var17) {
                    }
                }
            }

            BlockEntity _be = world.getBlockEntity(_bp);
            CompoundTag _bnbt = null;
            if (_be != null) {
                _bnbt = _be.saveWithFullMetadata(world.registryAccess());
                _be.setRemoved();
            }

            world.setBlock(_bp, _bs, 3);
            if (_bnbt != null) {
                _be = world.getBlockEntity(_bp);
                if (_be != null) {
                    try {
                        _be.loadWithComponents(_bnbt, world.registryAccess());
                    } catch (Exception var16) {
                    }
                }
            }
        }

    }
}
