(ns reagent-material-ui.icons.satellite-outlined
  "Imports @material-ui/icons/SatelliteOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def satellite-outlined (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14zM8.57 6H6v2.58c1.42 0 2.57-1.16 2.57-2.58zM12 6h-1.71c0 2.36-1.92 4.29-4.29 4.29V12c3.32 0 6-2.69 6-6zm2.14 5.86l-3 3.87L9 13.15 6 17h12z"})
                                         "SatelliteOutlined"))
