(ns reagent-material-ui.icons.wb-incandescent-rounded
  "Imports @material-ui/icons/WbIncandescentRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def wb-incandescent-rounded (create-svg-icon (e "path" #js {"d" "M4.25 19.79c.39.39 1.02.39 1.41 0l.39-.39c.39-.39.38-1.02 0-1.4l-.01-.01a.9959.9959 0 00-1.41 0l-.39.39c-.38.4-.38 1.02.01 1.41zM11.99 23H12c.55 0 .99-.44.99-.99v-.96c0-.55-.44-.99-.99-.99h-.01c-.55 0-.99.44-.99.99v.96c0 .55.44.99.99.99zM3.01 11.05H1.99c-.55 0-.99.44-.99.99v.01c0 .55.44.99.99.99H3c.55 0 .99-.44.99-.99v-.01c.01-.55-.43-.99-.98-.99zM15 6.86V3.05c0-.55-.45-1-1-1h-4c-.55 0-1 .45-1 1v3.81c-2.04 1.18-3.32 3.52-2.93 6.13.4 2.61 2.56 4.7 5.18 5.02 3.64.44 6.75-2.4 6.75-5.95 0-2.23-1.21-4.16-3-5.2zm5 5.18v.01c0 .55.44.99.99.99H22c.55 0 .99-.44.99-.99v-.01c0-.55-.44-.99-.99-.99h-1.01c-.55 0-.99.44-.99.99zm-2.06 7.37l.39.39c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-.39-.39c-.39-.39-1.02-.38-1.4 0-.4.4-.4 1.02-.01 1.41z"})
                                              "WbIncandescentRounded"))
