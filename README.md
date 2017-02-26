# Sherlock-and-Valid-String

The "Sherlock and Valid String" problem is a problem found on hackerrank.com. The goal of the problem is to create a program that determines whether or not a given input String is a valid String or not. A String is considered valid if all lowercase letters within the String appear with the same frequency. Also, an invalid String will only be considered valid if removing one character from it will make the new String fit the criteria of a valid String. For example, "aabbcc" is a valid String because 'a', 'b', and 'c' each appear 2 times in the String. "aabbc" is also a valid String because while 'a' and 'b' appear 2 times and 'c' only appears once, removing one character (namely, 'c') will result in a new, valid String "aabb". However, "aabbcccc" is not a valid String because 'c' can only appear 3 or 4 times in the String and so can never match the frequency with which 'a' and 'b' appear. Below are some one line sample inputs:

  aabbcd

  abbac

  jtqgugmcsxvdwidtcyqpogkdifapuloqykjfxruvfrshcehekoiwbpbrprahwvhliglyxynjotbaswnnnmxbkmcftvsdqajemeul

  hfchdkkbfifgbgebfaahijchgeeeiagkadjfcbekbdaifchkjfejckbiiihegacfbchdihkgbkbddgaefhkdgccjejjaajgijdkd

A separate file titled "longinput" contains a very large input String that you can also try out.
