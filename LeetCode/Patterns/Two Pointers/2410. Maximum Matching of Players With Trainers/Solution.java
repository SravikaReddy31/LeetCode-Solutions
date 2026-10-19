class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        int i = 0;
        int j = 0;
        while(i<players.length && j<trainers.length) {
            if(players[i] <= trainers[j] || trainers[j] <= players[i]) {
                count++;
                i++;

            }
            j++;
        }
        return count;
    }
}