
String fname = 'units.txt'
String units = new File(fname).text

units = units
         .replaceAll(/(?ms)\/\*.*?\*\//,'')
         .replaceAll(/(?m)\/\/.*?$/,'')
         .replaceAll(/(?m)^\s*$/,'')

println units
