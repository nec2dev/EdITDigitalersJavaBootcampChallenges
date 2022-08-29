/*1. Importar el archivo CSV llamado TOP_SPOTIFY* a la base de datos con el nombre BONUS TRACK.
Tener en cuenta las siguientes indicaciones:
a. No cambies el nombre de la tabla.
b. Elimina la tabla en el caso de que ya exista dentro de la base de datos.
c. Mantén los tipos de datos asignados al momento de la importación.*/

#2. Mostrar todo el contenido de la tabla TOP_SPOTIFY.
#SELECT * FROM TOP_SPOTIFY;

#3. En el resultado de la consulta, sólo se deben observar las columnas ARTISTA, TÍTULO y GÉNERO.3
#SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY;

#4. Ordenar alfabéticamente el resultado de la consulta según los géneros musicales.
#SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY ORDER BY GENERO;

#5. En el caso de aquellos géneros que se repiten, ordenar alfabéticamente los nombres de los artistas.
/*SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY
ORDER BY GENERO, ARTISTA;*/

/*1. En base al ejercicio anterior, mostrar todos los registros de la tabla TOP_SPOTIFY. En el resultado,
sólo se deben observar las columnas ARTISTA, TÍTULO y GÉNERO. Ordenar alfabéticamente el
resultado según los nombres de los artistas y el nombre de las canciones. Mostrar únicamente
las 10 primeras canciones.*/
/*SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY
ORDER BY ARTISTA, TITULO LIMIT 10;*/

/*2. Modificar la consulta anterior para mostrar únicamente las canciones ubicadas desde la posición 11 hasta la
15 inclusive.*/
/*SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY
ORDER BY ARTISTA, TITULO LIMIT 5 OFFSET 10;*/

/*3. Dada la tabla TOP_SPOTIFY, obtener una lista de todas aquellas canciones pertenecientes a la cantante llamada
Madonna. Debes mostrar todos los campos de la tabla en el resultado de la consulta.*/
#SELECT * FROM TOP_SPOTIFY WHERE ARTISTA = 'MADONNA';

/*4. A partir de la tabla TOP_SPOTIFY, obtener una lista de todas aquellas canciones que pertenecen al género
Pop. Mostrar todos los campos de la tabla en el resultado de la consulta y ordenar alfabéticamente
el resultado según el nombre de las canciones.*/
#SELECT * FROM TOP_SPOTIFY WHERE GENERO = 'POP' ORDER BY TITULO;

/*5. De la tabla TOP_SPOTIFY, obtener una lista de todas las canciones pertenecientes al género Pop lanzadas
durante el año 2015. Mostrar todos los campos de la tabla en el resultado de la consulta y ordenar dicho
resultado alfabéticamente según los nombres de los artistas y los nombres de las canciones.*/
/*SELECT * FROM TOP_SPOTIFY WHERE GENERO = 'POP'
AND ANO = 2015
ORDER BY ARTISTA, TITULO;*/

/*1. Generar una lista que muestre todos los datos de los autores nacidos en la Ciudad
de Buenos Aires.*/
/*USE LIBRERÍA;
#SELECT * FROM AUTORES WHERE CIUDAD = 'BUENOS AIRES';*/

/*2. Crear una lista que muestre todos los datos de los libros con precio mayor a 30 dólares.
Ordenar los precios de mayor a menor.*/
/*SELECT * FROM LIBROS
WHERE PRECIO > 30
ORDER BY PRECIO DESC;*/

/*3. Crear una lista que muestre todos los datos de los autores que no residen
en la Provincia de Buenos Aires (BA). Ordenar de manera alfabética las
provincias resultantes.*/
/*SELECT * FROM AUTORES
WHERE PROVINCIA <> 'BA'
ORDER BY PROVINCIA;*/

/*4. Generar una lista que muestre todos los datos de los libros que forman
parte de la categoría cuentos y cuyo precio sea inferior a 20 dólares.
Ordenar los títulos resultantes de manera alfabética.*/
/*SELECT * FROM LIBROS
WHERE CATEGORIA = 'CUENTOS' AND PRECIO < 20
ORDER BY TITULO;*/

/*5. Generar una lista que muestre todos los datos de los libros que forman
parte de las categorías novelas o ensayos. Ordenar alfabéticamente
los títulos de los libros obtenidos.*/
/*SELECT * FROM LIBROS
WHERE CATEGORIA = 'NOVELAS' OR CATEGORIA = 'ENSAYOS'
ORDER BY TITULO;*/

/*6. Generar una lista que muestre todos los datos de los libros cuyo precio
oscile entre 20 y 35 dólares inclusive. Ordenar los precios resultantes de
menor a mayor.*/
/*SELECT * FROM LIBROS
WHERE PRECIO BETWEEN 20 AND 35
ORDER BY PRECIO;*/

/*7. Crear una lista que muestre todos los datos de los autores cuyo nombre sea Jorge Luis, Victoria, Ernesto
o Adolfo. Ordenar los resultados en orden alfabético.*/
/*SELECT * FROM AUTORES
WHERE NOMBRE IN ('JORGE LUIS', 'VICTORIA', 'ERNESTO', 'ADOLFO')
ORDER BY NOMBRE;*/

/*8. Generar una lista que muestre todos los datos de los libros cuyo título contenga la palabra
mundo. Ordenar los títulos alfabéticamente.*/
/*SELECT * FROM LIBROS
WHERE TITULO LIKE '%MUNDO%'
ORDER BY TITULO;*/

/*9. Crear una lista que muestre todos los datos de los libros cuyo título contenga la preposición
“de”. Ordenar los títulos alfabéticamente.*/
/*SELECT * FROM LIBROS
WHERE TITULO LIKE '% DE %'
ORDER BY TITULO;*/

/*10. Generar una lista que muestre todos los datos de los libros que no tengan cargado
su precio. Luego, ordenar alfabéticamente los resultados.*/
/*SELECT * FROM LIBROS
WHERE PRECIO IS NULL
ORDER BY TITULO;*/




