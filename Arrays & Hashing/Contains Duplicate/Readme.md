<h1>Contains Duplicate</h1>

<p>
Given an integer array <strong>nums</strong>, return <strong>true</strong> if any value appears more than once in the array,
otherwise return <strong>false</strong>.
</p>

<h2>Problem Description</h2>

<p>
The goal is to determine whether an array contains duplicate values.
If any number appears more than once, the function should return <strong>true</strong>.
If all elements are unique, the function should return <strong>false</strong>.
</p>

<h2>Examples</h2>

<h3>Example 1</h3>

<pre>
Input: nums = [1, 2, 3, 3]

Output: true

Explanation:
The number 3 appears twice in the array.
</pre>

<h3>Example 2</h3>

<pre>
Input: nums = [1, 2, 3, 4]

Output: false

Explanation:
All numbers in the array are unique.
</pre>

<h2>Constraints</h2>

<ul>
<li>The array may contain positive or negative integers</li>
<li>The array can have any size greater than or equal to 1</li>
</ul>





<h1> Portugues</h1>

<h1>Contém Duplicados</h1>

<p>
Dado um array de inteiros <strong>nums</strong>, retorne <strong>true</strong> se algum valor aparecer mais de uma vez no array,
caso contrário retorne <strong>false</strong>.
</p>

<h2>Descrição do Problema</h2>

<p>
O objetivo é determinar se um array contém valores duplicados.
Se qualquer número aparecer mais de uma vez, a função deve retornar <strong>true</strong>.
Se todos os elementos forem únicos, a função deve retornar <strong>false</strong>.
</p>

<h2>Exemplos</h2>

<h3>Exemplo 1</h3>

<pre>
Entrada: nums = [1, 2, 3, 3]

Saída: true

Explicação:
O número 3 aparece duas vezes no array.
</pre>

<h3>Exemplo 2</h3>

<pre>
Entrada: nums = [1, 2, 3, 4]

Saída: false

Explicação:
Todos os números do array são únicos.
</pre>

<h2>Restrições</h2>

<ul>
<li>O array pode conter números inteiros positivos ou negativos</li>
<li>O array pode ter qualquer tamanho maior ou igual a 1</li>
</ul>

<h2>Abordagem</h2>

<p>
A solução utilizamos foi a estrutura de dados <strong>HashSet</strong>.
Durante a iteração pelo array:
</p>

<ul>
<li>Se o número já estiver no conjunto → retornar <strong>true</strong></li>
<li>Se não estiver → inserir o número no conjunto</li>
</ul>

<p>
Se a iteração terminar sem encontrar duplicados, retornar <strong>false</strong>.
</p>