// This function is called when a player deals damage

__on_player_deals_damage(player, amount, entity)->
{
    // Make a scoreboard with the objective "damage"
    scoreboard_add('damage'), 
    
    // Add the total amount of damage dealt
    scoreboard('damage', player, amount + scoreboard('damage', player));
}
