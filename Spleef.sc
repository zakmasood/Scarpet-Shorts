// This function is called when a player right clicks a block

__on_player_right_clicks_block(player, item_tuple, hand, block, face, hitvec)->
{
    // Make a new object called my_block
    
    my_block = block('minecraft:snow_block'),
    
    // If block is a snow block
    if (block(block) == my_block,
    
        // Set the block to air
        set(block(block), 'minecraft:air');
    )
}

// The credit for this program goes to my dad who taught me how to use object types in scarpet!

