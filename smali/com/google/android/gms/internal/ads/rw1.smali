.class public final enum Lcom/google/android/gms/internal/ads/rw1;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/rw1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/google/android/gms/internal/ads/rw1;

.field public static final enum c:Lcom/google/android/gms/internal/ads/rw1;

.field public static final enum d:Lcom/google/android/gms/internal/ads/rw1;

.field private static final synthetic e:[Lcom/google/android/gms/internal/ads/rw1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ads/rw1;

    const/4 v1, 0x0

    const-string v2, "UNCOMPRESSED"

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/rw1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/rw1;->b:Lcom/google/android/gms/internal/ads/rw1;

    new-instance v0, Lcom/google/android/gms/internal/ads/rw1;

    const/4 v2, 0x1

    const-string v3, "COMPRESSED"

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/ads/rw1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/rw1;->c:Lcom/google/android/gms/internal/ads/rw1;

    new-instance v0, Lcom/google/android/gms/internal/ads/rw1;

    const/4 v3, 0x2

    const-string v4, "DO_NOT_USE_CRUNCHY_UNCOMPRESSED"

    invoke-direct {v0, v4, v3}, Lcom/google/android/gms/internal/ads/rw1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/rw1;->d:Lcom/google/android/gms/internal/ads/rw1;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/ads/rw1;

    sget-object v5, Lcom/google/android/gms/internal/ads/rw1;->b:Lcom/google/android/gms/internal/ads/rw1;

    aput-object v5, v4, v1

    sget-object v1, Lcom/google/android/gms/internal/ads/rw1;->c:Lcom/google/android/gms/internal/ads/rw1;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lcom/google/android/gms/internal/ads/rw1;->e:[Lcom/google/android/gms/internal/ads/rw1;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/rw1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rw1;->e:[Lcom/google/android/gms/internal/ads/rw1;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/rw1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/rw1;

    return-object v0
.end method
