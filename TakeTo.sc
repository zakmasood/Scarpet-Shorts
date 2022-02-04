// Function called when player uses their elytra

__on_player_deploys_elytra(player)->
{
    // Display a title above the hotbar saying take to the skies!
    display_title(player, 'actionbar', format('g Take to the skies!'));
}
