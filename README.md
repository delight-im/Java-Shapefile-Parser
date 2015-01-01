# Java-Shapefile-Parser

Parses ESRI shapefiles and extracts all spatial/geometric data with attributes

## Usage

### Command-line

`java -jar Java-Shapefile-Parser.jar "shape_file.shp" > output.csv`

### Java

`String csv = ShapefileParser.parse("shape_file.shp");`

## Contributing

All contributions are welcome! If you wish to contribute, please create an issue first so that your feature, problem or question can be discussed.

## Dependencies

 * [GeoTools](http://www.geotools.org/) — [OSGeo](http://www.osgeo.org/) — [LGPL 2.1](http://www.gnu.org/licenses/lgpl-2.1.html)

## License

```
Copyright 2015 www.delight.im <info@delight.im>

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
```
