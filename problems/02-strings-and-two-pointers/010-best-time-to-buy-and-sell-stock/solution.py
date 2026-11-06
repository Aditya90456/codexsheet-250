# Judged input: one argument per line.
#   line 1: prices (integers, space separated)
# Judged output: values separated by single spaces, booleans as true/false.

import sys

lines = sys.stdin.read().splitlines()
prices = [int(x) for x in lines[0].split()]


def show(value):
    if isinstance(value, (list, tuple)):
        return " ".join("true" if item is True else "false" if item is False else str(item) for item in value)
    if isinstance(value, bool):
        return "true" if value else "false"
    return str(value)


# Write your solution below, then Submit to run the judged cases.
def solution(prices):
    return []


print(show(solution(prices)))

