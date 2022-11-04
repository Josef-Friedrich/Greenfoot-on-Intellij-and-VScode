Sample project to demonstrate how a Greenfoot application can be run within Intellij and Visual Studio Code

https://github.com/Rc-Cookie/greenfoot-sources-combined

# IntelliJ

`src/standalone.properties`

```ini
main.class=MyWorld
controls.pause.button=Pause
controls.run.button=Start
run.once=Run
reset.world=Reset
controls.speed.label=Simulation Speed:
scenario.hideControls=false
controls.speedSlider.tooltip=Adjusts the execution framerate
controls.pause.shortDescription=Pause the simulation.
project.name=Greenfoot scenario made in IntelliJ IDEA
controls.run.longDescription=Run the simulation until stopped.
controls.reset.longDescription=Instantiate a new world.
scenario.viewer.appletInfo=
scenario.lock=false
controls.pause.longDescription=Pause the simulation, leaving it in the current state.
run.simulation=Run
pause.simulation=Pause
scenario.fullScreen=false
controls.reset.shortDescription=Reset the scenario.
controls.run.shortDescription=Start the simulation.
controls.runonce.longDescription=Call 'act' once for every actor in the current world.
controls.runonce.shortDescription=Call 'act' once for every actor in the current world.
user.name=YourNameHere
```

`.idea/libraries/lib.xml`

```xml
<component name="libraryTable">
  <library name="lib">
    <CLASSES>
      <root url="jar://$PROJECT_DIR$/lib/greenfoot-3.7.0.jar!/" />
      <root url="jar://$PROJECT_DIR$/lib/bluejcore-3.7.0.jar!/" />
      <root url="file:///usr/share/greenfoot/javafx/lib" />
      <root url="file:///usr/share/greenfoot/stylesheets" />
    </CLASSES>
    <JAVADOC />
    <SOURCES />
    <jarDirectory url="file:///usr/share/greenfoot/javafx/lib" recursive="false" />
  </library>
</component>
```

`.idea/workspace.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project>
  <component name="RunManager">
    <configuration name="Run Scenario" type="Application" factoryName="Application">
      <option name="MAIN_CLASS_NAME" value="greenfoot.export.GreenfootScenarioApplication" />
      <module name="greenfoot" />
      <option name="VM_PARAMETERS" value="--module-path=/usr/share/greenfoot/javafx/lib --add-modules=javafx.controls,javafx.fxml" />
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
  </component>
</project>
```

