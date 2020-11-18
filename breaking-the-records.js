/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array scores = [12, 24, 10 24]. Scores are in the same order as the games played. She would tabulate her results as follows:

                                 Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1



Given the scores for a season, find and print the number of times Maria breaks her records for most and least points scored during the season.



Function Description

Complete the breakingRecords function in the editor below. It must return an integer array containing the numbers of times she broke her records. Index 0 is for breaking most points records, and index 1 is for breaking least points records.




breakingRecords has the following parameter(s):

scores: an array of integers





Input Format

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of score[0], score[1]... score[n-1].





Constraints

1 <= N <= 1000

0 <= scores[i] <= 10^8




Output Format

Print two space-separated integers describing the respective numbers of times the best (highest) score increased and the worst (lowest) score decreased.




Sample Input

9
10 5 20 20 4 5 2 25 1



Sample Output

2 4



Explanation

She broke her best record twice (after games [2] and [7]) and her worst record four times (after games [1], [4], [6], and [8]), so we print [2, 4] as our answer. Note that she did not break her record for best score during game [3], as her score during that game was not strictly greater than her best record at the time.
 */

function breakingRecords(scores) {
    var least = scores[0];
    var most = scores[0];
    var mostCount = 0;
    var leastCount = 0;
    var arr = [];

    function leastAdd(score) {
        if (score < least) {
            least = score;
            leastCount++;
        }
    }

    function mostAdd(score) {
        if (score > most) {
            most = score;
            mostCount++;
        }
    }

    scores.forEach(mostAdd);
    scores.forEach(leastAdd);

    arr.push(mostCount);
    arr.push(leastCount);

    return arr;

}