// This function is called when a player right clicks a block

__on_player_right_clicks_block(player, item_tuple, hand, block, face, hitvec)->
{

// If statemets cant have normal operators.
// In the case of this if statement, the block function stores the data of the block the player right clicks.
// If the block is equal to 'minecraft:white_concrete' or white concrete.

    if (block(block), 'minecraft:white_concrete')
    {
        // Set the block to 'minecraft:red_concrete' or red concrete!
        set(block, 'minecraft:red_concrete');
    }
}
