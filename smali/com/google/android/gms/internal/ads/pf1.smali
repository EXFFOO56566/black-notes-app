.class public final Lcom/google/android/gms/internal/ads/pf1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final enum a:I = 0x1

.field public static final enum b:I = 0x2

.field public static final enum c:I = 0x3

.field private static final synthetic d:[I

.field public static final enum e:I = 0x1

.field private static final synthetic f:[I

.field public static final enum g:I = 0x1

.field public static final enum h:I = 0x2

.field public static final enum i:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v3, v1, v2

    const/4 v4, 0x2

    aput v4, v1, v3

    aput v0, v1, v4

    sput-object v1, Lcom/google/android/gms/internal/ads/pf1;->d:[I

    new-array v0, v3, [I

    aput v3, v0, v2

    sput-object v0, Lcom/google/android/gms/internal/ads/pf1;->f:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/pf1;->d:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static b()[I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/pf1;->f:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
