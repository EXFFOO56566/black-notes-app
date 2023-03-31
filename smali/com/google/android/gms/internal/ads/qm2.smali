.class public final Lcom/google/android/gms/internal/ads/qm2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private a:J

.field private b:Landroid/os/Bundle;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Landroid/os/Bundle;

.field private g:Landroid/os/Bundle;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/qm2;->a:J

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/qm2;->b:Landroid/os/Bundle;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/qm2;->c:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qm2;->d:Ljava/util/List;

    iput v0, p0, Lcom/google/android/gms/internal/ads/qm2;->e:I

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qm2;->f:Landroid/os/Bundle;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qm2;->g:Landroid/os/Bundle;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qm2;->h:Ljava/util/List;

    iput v0, p0, Lcom/google/android/gms/internal/ads/qm2;->i:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/qm2;->j:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/rm2;
    .locals 26

    move-object/from16 v0, p0

    new-instance v25, Lcom/google/android/gms/internal/ads/rm2;

    move-object/from16 v1, v25

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/qm2;->a:J

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/qm2;->b:Landroid/os/Bundle;

    iget v6, v0, Lcom/google/android/gms/internal/ads/qm2;->c:I

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/qm2;->d:Ljava/util/List;

    iget v9, v0, Lcom/google/android/gms/internal/ads/qm2;->e:I

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/qm2;->f:Landroid/os/Bundle;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/qm2;->g:Landroid/os/Bundle;

    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/qm2;->h:Ljava/util/List;

    move-object/from16 v17, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/qm2;->i:I

    move/from16 v22, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/qm2;->j:Ljava/util/List;

    move-object/from16 v24, v2

    const/16 v2, 0x8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v1 .. v24}, Lcom/google/android/gms/internal/ads/rm2;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/ads/br2;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/ads/lm2;ILjava/lang/String;Ljava/util/List;)V

    return-object v25
.end method
