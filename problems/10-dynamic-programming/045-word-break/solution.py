# Judged input: one argument per line.
#   line 1: s (a single word)
#   line 2: wordDict (words, space separated)
# Judged output: values separated by single spaces, booleans as true/false.

import sys

lines = sys.stdin.read().splitlines()
s = lines[0]
wordDict = [x for x in lines[1].split()]


def show(value):
    if isinstance(value, (list, tuple)):
        return " ".join("true" if item is True else "false" if item is False else str(item) for item in value)
    if isinstance(value, bool):
        return "true" if value else "false"
    return str(value)


# Write your solution below, then Submit to run the judged cases.
def solution(s, wordDict):
    return []


print(show(solution(s, wordDict)))

