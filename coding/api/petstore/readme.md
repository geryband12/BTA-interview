# Project
A project kibővítésével írj a már implementált végpontokhoz a dokumentáció alapján egy negatív és egy pozitív tesztestet (https://petstore.swagger.io/)
## Ellenőrzés
- Minden teszthez írj assertion-t ami legalább azt ellenőrzi, hogy
  - A kérés http response code megfelelő
  - 500 milisecond alatt volt a válaszidő
- Írj a Pet Id alapú lekérdezéséhez assertion-t ami ellenőrzi, hogy
    - A kötelező mezőket visszakaptuk
    - Kötelező mezők formátuma megfelel a swagger-ben leírtaknak
    - Ha kapunk vissza státuszt az értéke az enumban definiáltaknak megfelel
## Teljes folyamat teszt
- Üzleti folyamat tesztelése (create,update,getById,delete,getbyId)
- Hozd létre a szükséges még nem implementált végpont hívásokat
- Folyamat:
  - Hozz létre egy új /{petId} lista elemet
  - Módosítsd ez előbb létrehozott elemet
  - Majd töröld a módosított elemet
  - Módosítás és törlés ellenőrzése GET /pet/{petId} végponttal
  - Írj ellenőrzéseket a végpontok válaszára
## Logolás
Módosítsd a logolást, hogy
- lecseréled az emoji-kat az általad megfelelőnek ítélt írásjelekre
- kilogolod a lefutott teszt nevét is (a @Test annotation-al megjelölt osztály nevét)
# Reporting
- Ha bármilyen hibát megfogott a teszted dokumentáld le úgy, hogy a legkönnyebben javítható legyen.
- A használt nyelven NE módosítsd, ha húzol be új könyvtárat röviden indokold miért volt rá szükség.
# Leadás
A feladat beadási határideje a kiküldéstől számított egy hét. 
Kérlek küld el a github linkjét a projectednek. 
