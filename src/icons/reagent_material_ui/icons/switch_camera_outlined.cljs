(ns reagent-material-ui.icons.switch-camera-outlined
  "Imports @material-ui/icons/SwitchCameraOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def switch-camera-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 4h-3.17L15 2H9L7.17 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM9.88 4h4.24l1.83 2H20v12H4V6h4.05"}) (e "path" #js {"d" "M15 11H9V8.5L5.5 12 9 15.5V13h6v2.5l3.5-3.5L15 8.5z"}))
                                             "SwitchCameraOutlined"))
