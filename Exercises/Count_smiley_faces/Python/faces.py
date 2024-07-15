def count_smileys(arr):
    valid_faces = 0
    for face in arr:
            if len(face) == 2:
                  if face[0] in [":", ";"] and face[1] in ["D", ")"]:
                        valid_faces +=1
            elif len(face) == 3:
                  if face[0] in [":", ";"] and face[1] in ["-", "~"] and face[2] in ["D", ")"]:
                        valid_faces +=1
            else:
                  return 0
    return valid_faces

count_smileys(arr = [':D',':~)',';~D',':)'])