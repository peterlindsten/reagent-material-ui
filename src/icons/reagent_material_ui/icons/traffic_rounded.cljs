(ns reagent-material-ui.icons.traffic-rounded
  "Imports @material-ui/icons/TrafficRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def traffic-rounded (create-svg-icon (e "path" #js {"d" "M19.96 10.59c.04-.31-.19-.59-.5-.59H17V8.86c1.54-.4 2.72-1.68 2.96-3.27.04-.31-.19-.59-.5-.59H17V4c0-.55-.45-1-1-1H8c-.55 0-1 .45-1 1v1H4.54c-.31 0-.54.28-.5.59C4.28 7.18 5.46 8.46 7 8.86V10H4.54c-.31 0-.54.28-.5.59.24 1.59 1.42 2.87 2.96 3.27V15H4.54c-.31 0-.54.28-.5.59.24 1.59 1.42 2.87 2.96 3.27V20c0 .55.45 1 1 1h8c.55 0 1-.45 1-1v-1.14c1.54-.4 2.72-1.68 2.96-3.27.04-.31-.19-.59-.5-.59H17v-1.14c1.54-.4 2.72-1.68 2.96-3.27zM12 19c-1.11 0-2-.9-2-2s.89-2 2-2c1.1 0 2 .9 2 2s-.89 2-2 2zm0-5c-1.11 0-2-.9-2-2s.89-2 2-2c1.1 0 2 .9 2 2s-.89 2-2 2zm0-5c-1.11 0-2-.9-2-2 0-1.11.89-2 2-2 1.1 0 2 .89 2 2 0 1.1-.89 2-2 2z"})
                                      "TrafficRounded"))
