<h1> Two Sum </h1>

<p>
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.
</p>

<h2>Example 1:</h2>

<pre>
Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
</pre>

<p>
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
</p>

<h2>Example 2:</h2>

<pre>
Input: nums = [4,5,6], target = 10

Output: [0,2]
</pre>

<h2>Example 3:</h2>

<pre>
Input: nums = [5,5], target = 10

Output: [0,1]
</pre>

<p>
Constraints:
<br>
2 <= nums.length <= 1000
<br>
-10,000,000 <= nums[i] <= 10,000,000
<br>
-10,000,000 <= target <= 10,000,000
<br>
Only one valid answer exists.
</p>

<h1> Solução </h1>

<p>
Foi utilizado o <b>HashMap</b> para armazenar os valores e seus respectivos índices.
A cada iteração, é calculado o valor complementar (target - nums[i]) e verificado
se ele já existe no mapa.
</p>

<p>
Caso exista, significa que encontramos os dois números que somam o target,
então retornamos seus índices.
Caso contrário, armazenamos o número atual no HashMap e seguimos a iteração.
</p>

<p>
Essa abordagem garante uma complexidade de tempo O(n), tornando a solução eficiente.
</p>
