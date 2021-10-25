bool isMatch(char * s, char * p){
    int i = 0, j = 0, star = -1, match = 0;
    while (s[i]) {
        if (p[j] == '*') {
            star = j;
            match = i;
            j++;
        } else if (p[j] == '?' || p[j] == s[i]) {
            i++;
            j++;
        } else if (star != -1) {
            j = star + 1;
            i = match + 1;
            match++;
        } else {
            return false;
        }
    }
    while (p[j] == '*') {
        j++;
    }
    return !p[j];
}