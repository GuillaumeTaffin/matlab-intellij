if x < 3
end


if doPlot == 1
    plot(density)
    title("Sample Densities")
    xticklabels(element)
    ylabel("Density (g/cm^3)")
else
    disp("The density of " + element ...
    + " is " + density)
end


if q ==1 ; a=3;end

if condition1
   code
elseif condition2
   code
else
   code
end