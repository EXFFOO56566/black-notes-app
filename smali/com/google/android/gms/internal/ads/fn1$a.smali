.class final enum Lcom/google/android/gms/internal/ads/fn1$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/fn1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/fn1$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/google/android/gms/internal/ads/fn1$a;

.field public static final enum c:Lcom/google/android/gms/internal/ads/fn1$a;

.field private static final synthetic d:[Lcom/google/android/gms/internal/ads/fn1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/fn1$a;

    const/4 v1, 0x0

    const-string v2, "OUTPUT_FUTURE_DONE"

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/fn1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/fn1$a;->b:Lcom/google/android/gms/internal/ads/fn1$a;

    new-instance v0, Lcom/google/android/gms/internal/ads/fn1$a;

    const/4 v2, 0x1

    const-string v3, "ALL_INPUT_FUTURES_PROCESSED"

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/ads/fn1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/fn1$a;->c:Lcom/google/android/gms/internal/ads/fn1$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/internal/ads/fn1$a;

    sget-object v4, Lcom/google/android/gms/internal/ads/fn1$a;->b:Lcom/google/android/gms/internal/ads/fn1$a;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lcom/google/android/gms/internal/ads/fn1$a;->d:[Lcom/google/android/gms/internal/ads/fn1$a;

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

.method public static values()[Lcom/google/android/gms/internal/ads/fn1$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/fn1$a;->d:[Lcom/google/android/gms/internal/ads/fn1$a;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/fn1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/fn1$a;

    return-object v0
.end method
