<h2>492. Construct the Rectangle</h2><h3>Easy</h3><hr><div><p>A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:</p>

<ol>
	<li>The area of the rectangular web page you designed must equal to the given target area.</li>
	<li>The width <code style="">W</code> should not be larger than the length <code style="">L</code>, which means <code style="">L &gt;= W</code>.</li>
	<li>The difference between length <code style="">L</code> and width <code style="">W</code> should be as small as possible.</li>
</ol>

<p>Return <em style="">an array <code style="">[L, W]</code> where <code style="">L</code> and <code style="">W</code> are the length and width of the&nbsp;web page you designed in sequence.</em></p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre style=""><strong>Input:</strong> area = 4
<strong>Output:</strong> [2,2]
<strong>Explanation:</strong> The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
</pre>

<p><strong>Example 2:</strong></p>

<pre style=""><strong>Input:</strong> area = 37
<strong>Output:</strong> [37,1]
</pre>

<p><strong>Example 3:</strong></p>

<pre style=""><strong>Input:</strong> area = 122122
<strong>Output:</strong> [427,286]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="">1 &lt;= area &lt;= 10<sup>7</sup></code></li>
</ul>
</div>