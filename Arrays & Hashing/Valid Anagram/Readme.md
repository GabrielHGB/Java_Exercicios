<h1 align="center">🧠 Exercício de Algoritmo</h1>

<p align="center">
Exercício de estrutura de dados e algoritmos resolvido em <b>Java</b>.
</p>

<hr>

<h2>📌 Problema</h2>

<p>
Dadas duas strings <b>s</b> e <b>t</b>, determine se elas são <b>anagramas</b>.
</p>

<p>
Um anagrama contém exatamente os mesmos caracteres de outra palavra,
porém em uma ordem diferente.
</p>

<hr>

<h2>📥 Entrada</h2>

<pre>
s = "racecar"
t = "carrace"
</pre>

<h2>📤 Saída</h2>

<pre>
true
</pre>

<hr>

<h2>⚙️ Estratégia</h2>

<ul>
<li>Verificar se os tamanhos das strings são diferentes.</li>
<li>Criar um vetor de 26 posições para contar as letras.</li>
<li>Somar as ocorrências da primeira string.</li>
<li>Subtrair as ocorrências da segunda string.</li>
<li>Se todos os valores forem zero, as palavras são anagramas.</li>
</ul>

<hr>

<h2>📊 Complexidade</h2>

<table>
<tr>
<th>Tipo</th>
<th>Complexidade</th>
</tr>

<tr>
<td>Tempo</td>
<td>O(n)</td>
</tr>

<tr>
<td>Espaço</td>
<td>O(1)</td>
</tr>
</table>

<hr>

<h2>💻 Implementação</h2>

<p>
A implementação pode ser encontrada no arquivo <b>ValidAnagram.java</b>.
</p>