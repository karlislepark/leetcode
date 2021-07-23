<h2>141. Linked List Cycle</h2><h3>Easy</h3><hr><div><p>Given <code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">head</code>, the head of a linked list, determine if the linked list has a cycle in it.</p>

<p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the&nbsp;<code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">next</code>&nbsp;pointer. Internally, <code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">pos</code>&nbsp;is used to denote the index of the node that&nbsp;tail's&nbsp;<code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">next</code>&nbsp;pointer is connected to.&nbsp;<strong>Note that&nbsp;<code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">pos</code>&nbsp;is not passed as a parameter</strong>.</p>

<p>Return&nbsp;<code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">true</code><em style="color: rgb(230, 230, 230) !important;"> if there is a cycle in the linked list</em>. Otherwise, return <code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">false</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" style="width: 300px; height: 97px; margin-top: 8px; margin-bottom: 8px; color: rgb(0, 0, 0) !important;">
<pre style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;"><strong>Input:</strong> head = [3,2,0,-4], pos = 1
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" style="width: 141px; height: 74px; color: rgb(0, 0, 0) !important;">
<pre style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;"><strong>Input:</strong> head = [1,2], pos = 0
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 0th node.
</pre>

<p><strong>Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" style="width: 45px; height: 45px; color: rgb(0, 0, 0) !important;">
<pre style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;"><strong>Input:</strong> head = [1], pos = -1
<strong>Output:</strong> false
<strong>Explanation:</strong> There is no cycle in the linked list.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of the nodes in the list is in the range <code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">[0, 10<sup>4</sup>]</code>.</li>
	<li><code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
	<li><code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">pos</code> is <code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">-1</code> or a <strong>valid index</strong> in the linked-list.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Can you solve it using <code style="background-color: rgb(67, 93, 107) !important; color: rgb(184, 184, 184) !important;">O(1)</code> (i.e. constant) memory?</p>
</div>