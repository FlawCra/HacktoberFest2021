var longestIncreasingPath = function (matrix) {
    if (matrix.length == 0) return 0;
    var dp = [];
    for (var i = 0; i < matrix.length; i++) {
        dp[i] = [];
        for (var j = 0; j < matrix[0].length; j++) {
            dp[i][j] = 1;
        }
    }
    var max = 1;
    for (var i = 0; i < matrix.length; i++) {
        for (var j = 0; j < matrix[0].length; j++) {
            max = Math.max(max, dfs(i, j, matrix, dp));
        }
    }
    return max;
};

var dfs = function (i, j, matrix, dp) {
    if (dp[i][j] != 1) {
        return dp[i][j];
    }
    var max = 1;
    if (i > 0 && matrix[i][j] > matrix[i - 1][j]) {
        max = Math.max(max, dfs(i - 1, j, matrix, dp) + 1);
    }
    if (i < matrix.length - 1 && matrix[i][j] > matrix[i + 1][j]) {
        max = Math.max(max, dfs(i + 1, j, matrix, dp) + 1);
    }
    if (j > 0 && matrix[i][j] > matrix[i][j - 1]) {
        max = Math.max(max, dfs(i, j - 1, matrix, dp) + 1);
    }
    if (j < matrix[0].length - 1 && matrix[i][j] > matrix[i][j + 1]) {
        max = Math.max(max, dfs(i, j + 1, matrix, dp) + 1);
    }
    dp[i][j] = max;
    return max;
};