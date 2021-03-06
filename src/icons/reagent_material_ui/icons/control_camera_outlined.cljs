(ns reagent-material-ui.icons.control-camera-outlined
  "Imports @material-ui/icons/ControlCameraOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def control-camera-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5.54 8.46L2 12l3.54 3.54 1.76-1.77L5.54 12l1.76-1.77zm6.46 10l-1.77-1.76-1.77 1.76L12 22l3.54-3.54-1.77-1.76zm6.46-10l-1.76 1.77L18.46 12l-1.76 1.77 1.76 1.77L22 12zm-10-2.92l1.77 1.76L12 5.54l1.77 1.76 1.77-1.76L12 2z"}) (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}))
                                              "ControlCameraOutlined"))
