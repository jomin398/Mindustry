package io.anuke.mindustry.world.consumers;

import io.anuke.mindustry.entities.TileEntity;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.meta.BlockStat;
import io.anuke.mindustry.world.meta.BlockStats;

public class ConsumeItem extends Consume {
    private final Item item;
    private final int amount;

    public ConsumeItem(Item item) {
        this.item = item;
        this.amount = 1;
    }

    public ConsumeItem(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Item get() {
        return item;
    }

    @Override
    public void update(Block block, TileEntity entity) {
        //doesn't update because consuming items is very specific
    }

    @Override
    public boolean valid(Block block, TileEntity entity) {
        return entity.items.has(item, amount);
    }

    @Override
    public void display(BlockStats stats) {
        stats.add(BlockStat.inputItem, item);
    }
}